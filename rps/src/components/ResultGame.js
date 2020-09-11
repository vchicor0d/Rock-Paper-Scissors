import React from "react"

class ResultGame extends React.Component {
    render() {
		return (
	    	<tr>
				<td>{this.props.player1Move}</td>
				<td>{this.props.player2Move}</td>
				<td>{this.props.gameResult}</td>
	    	</tr>
		)
    }
}
export default ResultGame;
