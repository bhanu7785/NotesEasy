import React, { useEffect } from 'react';
import {Jumbotron,Container,Button} from 'reactstrap';

const Home =  () => {

     useEffect(()=>
    {
        document.title="Home || Notes"
    },[]);

    return(
        <div>
            <Jumbotron className="text-center">
                <h1>Engineering Notes</h1>
                <p>This is devloped for students to learn things and implement in day to day life
                    Come Learn with us!!!...
                </p>

                <Container>
                    <Button color="primary" outline>Start Exploring</Button>
                </Container>
            </Jumbotron>

        </div>
    );

}

export default Home;