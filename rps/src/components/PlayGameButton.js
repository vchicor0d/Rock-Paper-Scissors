import React from "react"


class PlayGameButton extends React.Component {

    render() {
        return <input type="button" onClick={this.props.onClick} value="Play Round"/>
    }
}
export default PlayGameButton