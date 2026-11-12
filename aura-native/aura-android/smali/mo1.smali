.class public final Lmo1;
.super Lcx3;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final u:Landroid/widget/ImageView;

.field public final v:Landroid/widget/TextView;

.field public final w:Landroid/widget/TextView;

.field public final synthetic x:Lq7;


# direct methods
.method public constructor <init>(Lq7;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lmo1;->x:Lq7;

    .line 5
    .line 6
    invoke-direct {p0, p2}, Lcx3;-><init>(Landroid/view/View;)V

    .line 7
    .line 8
    .line 9
    iput-object p3, p0, Lmo1;->u:Landroid/widget/ImageView;

    .line 10
    .line 11
    iput-object p4, p0, Lmo1;->v:Landroid/widget/TextView;

    .line 12
    .line 13
    iput-object p5, p0, Lmo1;->w:Landroid/widget/TextView;

    .line 14
    .line 15
    const/4 p3, 0x1

    .line 16
    invoke-virtual {p4, p3}, Landroid/widget/TextView;->setSelected(Z)V

    .line 17
    .line 18
    .line 19
    new-instance p3, Lj8;

    .line 20
    .line 21
    const/16 p4, 0xa

    .line 22
    .line 23
    invoke-direct {p3, p4, p1, p0}, Lj8;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 27
    .line 28
    .line 29
    new-instance p3, Li8;

    .line 30
    .line 31
    const/4 p4, 0x2

    .line 32
    invoke-direct {p3, p4, p1, p0}, Li8;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p2, p3}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method
