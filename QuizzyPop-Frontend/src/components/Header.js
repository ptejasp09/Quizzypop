import React, { useEffect, useState } from "react";
import { Navbar, Nav, Container } from "react-bootstrap";
import { useSelector } from "react-redux";
import { LinkContainer } from "react-router-bootstrap";
import { useNavigate } from "react-router-dom";

const Header = () => {
  const navigate = useNavigate();
  const loginReducer = useSelector((state) => state.loginReducer);
  const [isLoggedIn, setIsLoggedIn] = useState(loginReducer.loggedIn);
  let profilePageUrl = "";

  const logoutHandler = () => {
    setIsLoggedIn(false);
    localStorage.clear();
    navigate("/login");
  };

  useEffect(() => {
    if (localStorage.getItem("jwtToken")) {
      setIsLoggedIn(true);
      loginReducer.user.roles.map((r) => {
        if (r["roleName"] === "ADMIN") {
          profilePageUrl = "/adminProfile";
        } else {
          profilePageUrl = "/";
        }
      });
    }
  }, [navigate]);

  return (
    <header>
      <Navbar bg="primary" variant="light" expand="lg" collapseOnSelect>
        <Container>
          <Navbar.Brand><font color="white">QuizzyPop</font></Navbar.Brand>

          <Navbar.Toggle aria-controls="responsive-navbar-nav" />
          <Navbar.Collapse id="responsive-navbar-nav">
            <Nav className="justify-content-end flex-grow-1 pe-3">
            {isLoggedIn ? (
                <LinkContainer to="/">
                  <Nav.Link><font color="white">Home</font></Nav.Link>
                </LinkContainer>
              ) : (
                <LinkContainer to="/">
                  <Nav.Link><font color="white">Home</font></Nav.Link>
                </LinkContainer>
              )}
              {isLoggedIn ? (
                <Nav.Link><font color="white">{loginReducer.user.firstName}</font></Nav.Link>
              ) : (
                <LinkContainer to="/login">
                  <Nav.Link><font color="white">Log IN</font></Nav.Link>
                </LinkContainer>
              )}

              {isLoggedIn ? (
                <LinkContainer to="/">
                  <Nav.Link onClick={logoutHandler}><font color="white">Logout</font></Nav.Link>
                </LinkContainer>
              ) : (
                <LinkContainer to="/register">
                  <Nav.Link><font color="white">Register</font></Nav.Link>
                </LinkContainer>
              )}
            </Nav>
          </Navbar.Collapse>
        </Container>
      </Navbar>
    </header>
  );
};

export default Header;