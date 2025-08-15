import React from 'react';
import ProductList from './components/ProductList';

function App() {
    return (
        <>
            <nav className="navbar navbar-expand-lg navbar-dark bg-dark mb-4">
                <div className="container">
                    <a className="navbar-brand" href="#">OnlineStore</a>
                </div>
            </nav>
            <main className="container">
                <div className="p-4 p-md-5 mb-4 rounded text-body-emphasis bg-body-secondary">
                    <div className="col-lg-6 px-0">
                        <h1 className="display-4 fst-italic">Welcome to Our Store</h1>
                        <p className="lead my-3">Check out our amazing collection of products below.</p>
                    </div>
                </div>
                <ProductList />
            </main>
            <footer className="py-5 text-center text-body-secondary bg-body-tertiary mt-4">
                <p>OnlineStore &copy; 2025</p>
            </footer>
        </>
    );
}

export default App;