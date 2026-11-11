.class public final Lk7;
.super Lcx3;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final u:Lbq4;

.field public final synthetic v:Ll7;


# direct methods
.method public constructor <init>(Ll7;Lbq4;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lk7;->v:Ll7;

    .line 2
    .line 3
    iget-object p1, p2, Lbq4;->n:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 6
    .line 7
    invoke-direct {p0, p1}, Lcx3;-><init>(Landroid/view/View;)V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, Lk7;->u:Lbq4;

    .line 11
    .line 12
    new-instance v0, Lp6;

    .line 13
    .line 14
    const/4 v1, 0x1

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
    iget-object p0, p2, Lbq4;->p:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p0, Landroid/widget/TextView;

    .line 32
    .line 33
    invoke-virtual {p0, v1}, Landroid/widget/TextView;->setSelected(Z)V

    .line 34
    .line 35
    .line 36
    iget-object p0, p2, Lbq4;->q:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p0, Landroid/widget/TextView;

    .line 39
    .line 40
    invoke-virtual {p0, v1}, Landroid/widget/TextView;->setSelected(Z)V

    .line 41
    .line 42
    .line 43
    return-void
.end method
