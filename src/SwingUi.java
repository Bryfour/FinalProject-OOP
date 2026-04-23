public class SwingUi {



}

// maybe rename to ui manager

/*
"SwingUi" controls things like borders / default borders etc
groups different ui element sections like by frame for faster implementation
makes it easy and fast to update the ui later on
default setups for fast ui building
prob move to html/css for local web ui later
method buildMainFrame
initializes jframe
sets borderlayout etc
method setupLeftPane
creates jsplitpane for top n bottom adjustable frames
top has import button n small preview
bottom has empty square frame constrained by width equals height binding
method setupHideShowTab
jbutton aligned to far left
toggles left pane visibility on click
method applyPanelBorders
takes jpanel n color as arguments
applies line border to group sections
all borders modify here when darkmode theme changes etc
method setMaxLeftWidth
max width constraint so left half cant be expanded too far etc
method styleEmptySquareFrame
base styling for the bottom left adjustable empty area
*/
