import logo from './logo.svg';
import './App.css';
import { UserList } from './components/test';
import { Route, Routes } from 'react-router-dom';
// import MenuBar from './components/Header';
import { ThemeProvider, createTheme } from '@mui/material/styles';
import { Container } from '@mui/material';
import Banner from './components/Banner';
import Footer from './components/Footer';

const theme = createTheme({
    palette: {
        primary: {
            main: '#1476A3',
        },
        secondary: {
            main: '#292977',
        },
    },
    typography: {
        fontSize: 16,
        fontFamily: ['Raleway, Arial'].join(','),
    },
    components: {
        MuiPaper: {
            styleOverrides: {
                rounded: {
                    borderRadius: '12px',
                },
            },
        },
        MuiButton: {
            styleOverrides: {
                root: {
                    borderRadius: '8px',
                },
            },
        },
    },
})

function App() {
  return (
   <div className="App">
            <ThemeProvider theme={theme}>
                {/* <MenuBar /> */}

                <Routes>
                    <Route path="/" element={
                        <>
                            <Banner />
                            <Container maxWidth="lg" sx={{ padding: "0", textAlign: "center", minHeight: "500px" }}>
                            </Container>
                        </>
                    } />
                </Routes>
                <Routes>
                    <Route path="/profile" element={
                        <Container maxWidth="lg" sx={{ padding: "0", textAlign: "center", minHeight: "500px" }}>
                        </Container>
                    } />
                </Routes>

                <Footer />
            </ThemeProvider>
    </div>
  );
}

export default App;
