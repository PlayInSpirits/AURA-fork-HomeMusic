.class public final Lol3;
.super Lcx3;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final u:Llv4;

.field public final synthetic v:Lzd0;


# direct methods
.method public constructor <init>(Lzd0;Llv4;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lol3;->v:Lzd0;

    .line 2
    .line 3
    iget-object p1, p2, Llv4;->n:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 6
    .line 7
    invoke-direct {p0, p1}, Lcx3;-><init>(Landroid/view/View;)V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, Lol3;->u:Llv4;

    .line 11
    .line 12
    iget-object p1, p2, Llv4;->t:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p1, Landroid/widget/TextView;

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setSelected(Z)V

    .line 18
    .line 19
    .line 20
    iget-object p1, p2, Llv4;->s:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p1, Landroid/widget/ImageView;

    .line 23
    .line 24
    new-instance v0, Lbj3;

    .line 25
    .line 26
    const/4 v1, 0x6

    .line 27
    invoke-direct {v0, v1, p0}, Lbj3;-><init>(ILjava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 31
    .line 32
    .line 33
    iget-object p1, p2, Llv4;->r:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p1, Landroid/widget/ImageView;

    .line 36
    .line 37
    new-instance p2, Ls7;

    .line 38
    .line 39
    const/4 v0, 0x7

    .line 40
    invoke-direct {p2, v0, p0}, Ls7;-><init>(ILjava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method
