/**
 * 导航栏触发事件
 */
$(document).ready(function () {
    $('#sidebarCollapse').on('click', function () {
        $('#sidebar').toggleClass('active');
        $(this).toggleClass('active');
        if (document.getElementById("content-user-flag").className == "content-user-init") {
            document.getElementById("content-user-flag").className = "content-user";
        }
        $('#content .content-user').toggleClass('active');
    });

    // 待检查
    $('#submitProposal').on('submit', function() {
        $(this).each(function() {
            this.reset();
        });
    });
});

/**
 * 页签选中事件
 */
function tabSelected (newSelected) {
    // 左侧管理页签选中同步
    leftSelectSync(newSelected);

    // 右上角选中同步
    rightSelectSync(newSelected);
};

/**
 * 左侧管理页签选中同步方法
 */
function leftSelectSync(newSelected) {
    let leftList = document.getElementsByClassName("nav-link nav-link-text font-style selected-left-flag");
    for (let i = 0;i < leftList.length;i++) {
        if (leftList[i].innerHTML.toString() == newSelected) {
            leftList[i].setAttribute("aria-expanded","true");
        } else {
            leftList[i].setAttribute("aria-expanded","false");
        }
    }
}

/**
 * 右上角选中同步方法
 */
function rightSelectSync(newSelected) {
    let rightList = document.getElementsByClassName("nav-item selected-right-flag");
    for (let i = 0;i < rightList.length;i++) {
        if (rightList[i].children[0].innerHTML.toString() == newSelected) {
            rightList[i].setAttribute("class", "nav-item selected-right-flag active");
        } else {
            rightList[i].setAttribute("class", "nav-item selected-right-flag");
        }
    }
}
