# Multi-Agent WebApp Builder 🚀

基于多 Agent 协同与长链推理（Chain-of-Thought）的 JavaWeb 自动化开发平台。

## 💡 项目背景
在日常的小型 Web 项目开发与教学场景中，基础用户系统、常规 CRUD 存在大量重复性工作。本项目通过引入大模型多 Agent 机制，将自然语言需求自动转化为可运行的 JavaWeb 源码，大幅缩短开发周期。

## ⚙️ 核心架构
本项目采用闭环 Agent 协作链路：
1. **需求解析 Agent**：实体与业务意图提取。
2. **任务规划 Agent**：利用 CoT 将宏观需求拆解为前后端及数据库子任务。
3. **代码生成 Agent**：并行产出 Servlet、JSP 及 SQL 脚本。
4. **测试与优化 Agent**：基于日志反馈进行自动化闭环修复。

## 📂 核心代码示例
本仓库展示了由 Agent 自动生成的核心基础模块代码：
- `LoginServlet.java` / `RegisterServlet.java`: 后端业务逻辑。
- `login.jsp` / `register.jsp`: 前端展示页面。
- `init.sql`: 数据库初始化脚本。

*注：本项目为核心流程的 Demo 展示，目前主要用于内部效率提升与提示词工程测试。*
