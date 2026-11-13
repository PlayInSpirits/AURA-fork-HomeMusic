.class public final Ldefpackage/uq0;
.super Ldefpackage/cx3;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final u:Ldefpackage/na4;

.field public final synthetic v:Ldefpackage/vq0;


# direct methods
.method public constructor <init>(Ldefpackage/vq0;Ldefpackage/na4;)V
    .locals 1

    .line 1
    iput-object p1, p0, Ldefpackage/uq0;->v:Ldefpackage/vq0;

    .line 2
    .line 3
    iget-object p1, p2, Ldefpackage/na4;->n:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 6
    .line 7
    invoke-direct {p0, p1}, Ldefpackage/cx3;-><init>(Landroid/view/View;)V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, Ldefpackage/uq0;->u:Ldefpackage/na4;

    .line 11
    .line 12
    new-instance p2, Ldefpackage/p6;

    .line 13
    .line 14
    const/16 v0, 0xc

    .line 15
    .line 16
    invoke-direct {p2, v0, p0}, Ldefpackage/p6;-><init>(ILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 20
    .line 21
    .line 22
    new-instance p2, Ldefpackage/q6;

    .line 23
    .line 24
    const/16 v0, 0x8

    .line 25
    .line 26
    invoke-direct {p2, v0, p0}, Ldefpackage/q6;-><init>(ILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method
