.class public final Ldefpackage/dj;
.super Ldefpackage/cx3;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final u:Ldefpackage/r20;

.field public final synthetic v:Ldefpackage/ej;


# direct methods
.method public constructor <init>(Ldefpackage/ej;Ldefpackage/r20;)V
    .locals 1

    .line 1
    iput-object p1, p0, Ldefpackage/dj;->v:Ldefpackage/ej;

    .line 2
    .line 3
    iget-object p1, p2, Ldefpackage/r20;->o:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 6
    .line 7
    invoke-direct {p0, p1}, Ldefpackage/cx3;-><init>(Landroid/view/View;)V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, Ldefpackage/dj;->u:Ldefpackage/r20;

    .line 11
    .line 12
    iget-object p2, p2, Ldefpackage/r20;->q:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p2, Landroid/widget/TextView;

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setSelected(Z)V

    .line 18
    .line 19
    .line 20
    new-instance p2, Ldefpackage/p6;

    .line 21
    .line 22
    const/4 v0, 0x6

    .line 23
    invoke-direct {p2, v0, p0}, Ldefpackage/p6;-><init>(ILjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 27
    .line 28
    .line 29
    new-instance p2, Ldefpackage/q6;

    .line 30
    .line 31
    invoke-direct {p2, v0, p0}, Ldefpackage/q6;-><init>(ILjava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method
