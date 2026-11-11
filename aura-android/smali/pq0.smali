.class public final synthetic Lpq0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Laf;


# instance fields
.field public final synthetic a:Lcom/eddyizm/tempus/ui/fragment/DirectoryFragment;

.field public final synthetic b:Lcom/eddyizm/tempus/subsonic/models/Directory;


# direct methods
.method public synthetic constructor <init>(Lcom/eddyizm/tempus/ui/fragment/DirectoryFragment;Lcom/eddyizm/tempus/subsonic/models/Directory;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lpq0;->a:Lcom/eddyizm/tempus/ui/fragment/DirectoryFragment;

    .line 5
    .line 6
    iput-object p2, p0, Lpq0;->b:Lcom/eddyizm/tempus/subsonic/models/Directory;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lpq0;->a:Lcom/eddyizm/tempus/ui/fragment/DirectoryFragment;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/DirectoryFragment;->l0:Lml3;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v1, v1, Lml3;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 11
    .line 12
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    add-int/2addr v1, p1

    .line 17
    iget-object p1, v0, Lcom/eddyizm/tempus/ui/fragment/DirectoryFragment;->l0:Lml3;

    .line 18
    .line 19
    iget-object p1, p1, Lml3;->f:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p1, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 22
    .line 23
    sget-object v2, Lj65;->a:Ljava/util/WeakHashMap;

    .line 24
    .line 25
    invoke-virtual {p1}, Landroid/view/View;->getMinimumHeight()I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    mul-int/lit8 p1, p1, 0x2

    .line 30
    .line 31
    iget-object v0, v0, Lcom/eddyizm/tempus/ui/fragment/DirectoryFragment;->l0:Lml3;

    .line 32
    .line 33
    if-ge v1, p1, :cond_1

    .line 34
    .line 35
    iget-object p1, v0, Lml3;->f:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p1, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 38
    .line 39
    iget-object p0, p0, Lpq0;->b:Lcom/eddyizm/tempus/subsonic/models/Directory;

    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Directory;->getName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-virtual {p1, p0}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_1
    iget-object p0, v0, Lml3;->f:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p0, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 52
    .line 53
    const p1, 0x7f1300fa

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setTitle(I)V

    .line 57
    .line 58
    .line 59
    return-void
.end method
