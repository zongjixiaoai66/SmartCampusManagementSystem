const base = {
    get() {
        return {
            url : "http://localhost:8080/zhihuixiaoyuan/",
            name: "zhihuixiaoyuan",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/zhihuixiaoyuan/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "智慧校园管理系统"
        } 
    }
}
export default base
