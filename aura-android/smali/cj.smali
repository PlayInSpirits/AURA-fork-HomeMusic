.class public final Lcj;
.super Lcx3;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final u:Lns3;

.field public final synthetic v:Ls6;


# direct methods
.method public constructor <init>(Ls6;Lns3;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lcj;->v:Ls6;

    .line 2
    .line 3
    iget-object p1, p2, Lns3;->o:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 6
    .line 7
    invoke-direct {p0, p1}, Lcx3;-><init>(Landroid/view/View;)V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, Lcj;->u:Lns3;

    .line 11
    .line 12
    new-instance v0, Lp6;

    .line 13
    .line 14
    const/4 v1, 0x5

    .line 15
    invoke-direct {v0, v1, p0}, Lp6;-><init>(ILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 19
    .line 20
    .line 21
    new-instance v0, Lq6;

    .line 22
    .line 23
    invoke-direct {v0, v1, p0}, Lq6;-><init>(ILjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 27
    .line 28
    .line 29
    iget-object p0, p2, Lns3;->q:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p0, Landroid/widget/TextView;

    .line 32
    .line 33
    const/4 p1, 0x1

    .line 34
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setSelected(Z)V

    .line 35
    .line 36
    .line 37
    return-void
.end method
