import React from "react"
import ResultGame from "./ResultGame";

class ResultsTable extends React.Component {
    state = {
		data:[]
	};

	appendChild = () => {
		let { data } = this.state;
		data.push(data.length);
		this.setState({data});
	}
    
    render() {
		return (
	    	<table>
				<thead>
					<tr>
		    			<th>Player 1 move</th>
		    			<th>Player 2 move</th>
		    			<th>Game Result</th>
					</tr>
				</thead>
				<tbody>
					{this.state.data.map( row =>
						<ResultGame player1Move={row.player1Move} />
					)}
				</tbody>
	    	</table>
		)
    }
}
export default ResultsTable

