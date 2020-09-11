import React from "react"
import PlayGameButton from "./PlayGameButton"
import ResultsTable from "./ResultsTable"

class RPS extends React.Component {

    playRound() {
        fetch('http://localhost:8080/game/play')
        .then(async response => console.log(await response.json()))
        .catch(err => console.error(err));
    }

    render() {
        return (
            <div id="game">
                <div id="p1Move">

                </div>
                <div id="p2Move">

                </div>
                <div id ="result">

                </div>
                <div id="buttons">
                    <PlayGameButton onClick={this.playRound}/>
                </div>
                <div id="resultsTable">
                    <ResultsTable />
                </div>
            </div>
        );
    }
}

export default RPS