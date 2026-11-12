.class public final Lvm3;
.super Lcx3;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final u:Ljv3;

.field public final synthetic v:Lej;


# direct methods
.method public constructor <init>(Lej;Ljv3;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lvm3;->v:Lej;

    .line 2
    .line 3
    iget-object p1, p2, Ljv3;->n:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 6
    .line 7
    invoke-direct {p0, p1}, Lcx3;-><init>(Landroid/view/View;)V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, Lvm3;->u:Ljv3;

    .line 11
    .line 12
    iget-object p2, p2, Ljv3;->p:Ljava/lang/Object;

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
    new-instance p2, Lbj3;

    .line 21
    .line 22
    const/16 v0, 0xa

    .line 23
    .line 24
    invoke-direct {p2, v0, p0}, Lbj3;-><init>(ILjava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 28
    .line 29
    .line 30
    new-instance p2, Lq6;

    .line 31
    .line 32
    const/16 v0, 0x10

    .line 33
    .line 34
    invoke-direct {p2, v0, p0}, Lq6;-><init>(ILjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method
