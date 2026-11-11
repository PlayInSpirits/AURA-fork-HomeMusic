.class public final Lu8;
.super Lcx3;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final u:Lss0;

.field public final synthetic v:Lv8;


# direct methods
.method public constructor <init>(Lv8;Lss0;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lu8;->v:Lv8;

    .line 2
    .line 3
    iget-object p1, p2, Lss0;->n:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 6
    .line 7
    invoke-direct {p0, p1}, Lcx3;-><init>(Landroid/view/View;)V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, Lu8;->u:Lss0;

    .line 11
    .line 12
    iget-object p1, p2, Lss0;->p:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p1, Landroid/widget/TextView;

    .line 15
    .line 16
    new-instance p2, Lp6;

    .line 17
    .line 18
    const/4 v0, 0x3

    .line 19
    invoke-direct {p2, v0, p0}, Lp6;-><init>(ILjava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method
