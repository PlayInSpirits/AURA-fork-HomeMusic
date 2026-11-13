.class public final Ldefpackage/xk3;
.super Ldefpackage/cx3;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final u:Ldefpackage/lo;

.field public final synthetic v:Ldefpackage/yk3;


# direct methods
.method public constructor <init>(Ldefpackage/yk3;Ldefpackage/lo;)V
    .locals 2

    .line 1
    iput-object p1, p0, Ldefpackage/xk3;->v:Ldefpackage/yk3;

    .line 2
    .line 3
    iget-object p1, p2, Ldefpackage/lo;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 6
    .line 7
    invoke-direct {p0, p1}, Ldefpackage/cx3;-><init>(Landroid/view/View;)V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, Ldefpackage/xk3;->u:Ldefpackage/lo;

    .line 11
    .line 12
    iget-object v0, p2, Ldefpackage/lo;->k:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Landroid/widget/TextView;

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setSelected(Z)V

    .line 18
    .line 19
    .line 20
    iget-object p2, p2, Ldefpackage/lo;->j:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p2, Landroid/widget/TextView;

    .line 23
    .line 24
    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setSelected(Z)V

    .line 25
    .line 26
    .line 27
    new-instance p2, Ldefpackage/bj3;

    .line 28
    .line 29
    const/4 v0, 0x4

    .line 30
    invoke-direct {p2, v0, p0}, Ldefpackage/bj3;-><init>(ILjava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method
