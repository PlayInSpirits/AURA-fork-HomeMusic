.class public final synthetic Ldefpackage/ev4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/widget/PopupMenu$OnMenuItemClickListener;


# instance fields
.field public final synthetic a:Lcom/eddyizm/tempus/ui/fragment/ToolbarFragment;

.field public final synthetic b:Ljava/util/ArrayList;


# direct methods
.method public synthetic constructor <init>(Lcom/eddyizm/tempus/ui/fragment/ToolbarFragment;Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/ev4;->a:Lcom/eddyizm/tempus/ui/fragment/ToolbarFragment;

    .line 5
    .line 6
    iput-object p2, p0, Ldefpackage/ev4;->b:Ljava/util/ArrayList;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 2

    .line 1
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, 0x1

    .line 6
    sub-int/2addr p1, v0

    .line 7
    if-gez p1, :cond_0

    .line 8
    .line 9
    const-string p1, "default"

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v1, p0, Ldefpackage/ev4;->b:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Ljava/lang/String;

    .line 19
    .line 20
    :goto_0
    if-nez p1, :cond_1

    .line 21
    .line 22
    return v0

    .line 23
    :cond_1
    iget-object p0, p0, Ldefpackage/ev4;->a:Lcom/eddyizm/tempus/ui/fragment/ToolbarFragment;

    .line 24
    .line 25
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/ToolbarFragment;->o0:Ldefpackage/vf2;

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Ldefpackage/vf2;->d(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return v0
.end method
