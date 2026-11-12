.class public final Lqo1;
.super Lcx3;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final u:Lrf2;

.field public final synthetic v:Lro1;


# direct methods
.method public constructor <init>(Lro1;Lrf2;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lqo1;->v:Lro1;

    .line 2
    .line 3
    iget-object p1, p2, Lrf2;->n:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 6
    .line 7
    invoke-direct {p0, p1}, Lcx3;-><init>(Landroid/view/View;)V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, Lqo1;->u:Lrf2;

    .line 11
    .line 12
    iget-object p1, p2, Lrf2;->o:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p1, Landroid/widget/CheckBox;

    .line 15
    .line 16
    new-instance p2, Lg20;

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    invoke-direct {p2, v0, p0}, Lg20;-><init>(ILjava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, p2}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method
