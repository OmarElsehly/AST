public class ASTPrinter extends ExprBaseListener {
    @Override
    public void enterAssign(ExprParser.AssignContext ctx) {
        System.out.println("Assignment to: " + ctx.ID().getText());
    }

    @Override
    public void enterAddSub(ExprParser.AddSubContext ctx) {
        System.out.println("Add/Sub Expression: " + ctx.getText());
    }

    @Override
    public void enterMulDiv(ExprParser.MulDivContext ctx) {
        System.out.println("Mul/Div Expression: " + ctx.getText());
    }

    @Override
    public void enterInt(ExprParser.IntContext ctx) {
        System.out.println("Integer value: " + ctx.INT().getText());
    }

    @Override
    public void enterId(ExprParser.IdContext ctx) {
        System.out.println("Identifier: " + ctx.ID().getText());
    }
}
