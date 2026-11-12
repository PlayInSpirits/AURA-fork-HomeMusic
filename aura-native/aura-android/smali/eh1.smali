.class public final Leh1;
.super Lcx3;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final u:Lie1;

.field public final synthetic v:Lej;


# direct methods
.method public constructor <init>(Lej;Lie1;)V
    .locals 1

    .line 1
    iput-object p1, p0, Leh1;->v:Lej;

    .line 2
    .line 3
    iget-object p1, p2, Lie1;->a:Landroid/widget/LinearLayout;

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lcx3;-><init>(Landroid/view/View;)V

    .line 6
    .line 7
    .line 8
    iput-object p2, p0, Leh1;->u:Lie1;

    .line 9
    .line 10
    new-instance p2, Lp6;

    .line 11
    .line 12
    const/16 v0, 0x10

    .line 13
    .line 14
    invoke-direct {p2, v0, p0}, Lp6;-><init>(ILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method
