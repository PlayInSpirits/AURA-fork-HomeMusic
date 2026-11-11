.class public final Ldh1;
.super Lcx3;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final u:Lrm3;

.field public final synthetic v:Lzd0;


# direct methods
.method public constructor <init>(Lzd0;Lrm3;)V
    .locals 1

    .line 1
    iput-object p1, p0, Ldh1;->v:Lzd0;

    .line 2
    .line 3
    iget-object p1, p2, Lrm3;->n:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, Landroid/widget/LinearLayout;

    .line 6
    .line 7
    invoke-direct {p0, p1}, Lcx3;-><init>(Landroid/view/View;)V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, Ldh1;->u:Lrm3;

    .line 11
    .line 12
    new-instance p2, Lp6;

    .line 13
    .line 14
    const/16 v0, 0xf

    .line 15
    .line 16
    invoke-direct {p2, v0, p0}, Lp6;-><init>(ILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method
