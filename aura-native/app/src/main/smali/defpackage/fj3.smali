.class public final synthetic Ldefpackage/fj3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:Ldefpackage/gj3;

.field public final synthetic o:I


# direct methods
.method public synthetic constructor <init>(Ldefpackage/gj3;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/fj3;->n:Ldefpackage/gj3;

    .line 5
    .line 6
    iput p2, p0, Ldefpackage/fj3;->o:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Ldefpackage/fj3;->n:Ldefpackage/gj3;

    .line 2
    .line 3
    iget-object v0, p1, Ldefpackage/gj3;->t:Landroidx/media3/ui/PlayerControlView;

    .line 4
    .line 5
    iget v1, p1, Ldefpackage/gj3;->s:I

    .line 6
    .line 7
    iget p0, p0, Ldefpackage/fj3;->o:I

    .line 8
    .line 9
    if-eq p0, v1, :cond_0

    .line 10
    .line 11
    iget-object p1, p1, Ldefpackage/gj3;->r:[F

    .line 12
    .line 13
    aget p0, p1, p0

    .line 14
    .line 15
    invoke-static {v0, p0}, Landroidx/media3/ui/PlayerControlView;->b(Landroidx/media3/ui/PlayerControlView;F)V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object p0, v0, Landroidx/media3/ui/PlayerControlView;->E:Landroid/widget/PopupWindow;

    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 21
    .line 22
    .line 23
    return-void
.end method
