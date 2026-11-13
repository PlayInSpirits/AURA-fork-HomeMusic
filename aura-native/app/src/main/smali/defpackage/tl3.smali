.class public final synthetic Ldefpackage/tl3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/a83;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/eddyizm/tempus/ui/fragment/PlaylistEditorFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/eddyizm/tempus/ui/fragment/PlaylistEditorFragment;I)V
    .locals 0

    .line 1
    iput p2, p0, Ldefpackage/tl3;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Ldefpackage/tl3;->b:Lcom/eddyizm/tempus/ui/fragment/PlaylistEditorFragment;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget v0, p0, Ldefpackage/tl3;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, Ldefpackage/tl3;->b:Lcom/eddyizm/tempus/ui/fragment/PlaylistEditorFragment;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, Ljava/util/List;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistEditorFragment;->n0:Ldefpackage/zd0;

    .line 14
    .line 15
    iput-object p1, p0, Ldefpackage/zd0;->r:Ljava/util/List;

    .line 16
    .line 17
    invoke-virtual {p0}, Ldefpackage/dw3;->d()V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const v0, 0x7f1303ff

    .line 26
    .line 27
    .line 28
    invoke-static {p1, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 33
    .line 34
    .line 35
    invoke-static {p0}, Ldefpackage/q05;->l(Ldefpackage/kc1;)Ldefpackage/v23;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {p0}, Ldefpackage/v23;->o()V

    .line 40
    .line 41
    .line 42
    :goto_0
    return-void

    .line 43
    :pswitch_0
    check-cast p1, Ljava/lang/Integer;

    .line 44
    .line 45
    if-nez p1, :cond_1

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistEditorFragment;->m0:Ldefpackage/wl3;

    .line 49
    .line 50
    iget-object v0, v0, Ldefpackage/wl3;->h:Ldefpackage/k03;

    .line 51
    .line 52
    const/4 v2, 0x0

    .line 53
    invoke-virtual {v0, v2}, Ldefpackage/ad2;->k(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    invoke-static {v0, v2, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 69
    .line 70
    .line 71
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistEditorFragment;->m0:Ldefpackage/wl3;

    .line 72
    .line 73
    iput-boolean v1, v0, Ldefpackage/wl3;->i:Z

    .line 74
    .line 75
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistEditorFragment;->l0:Ldefpackage/jv3;

    .line 76
    .line 77
    iget-object v0, v0, Ldefpackage/jv3;->p:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v0, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 80
    .line 81
    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->getMenu()Landroid/view/Menu;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    const v1, 0x7f0a0083

    .line 86
    .line 87
    .line 88
    invoke-interface {v0, v1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    const/4 v1, 0x1

    .line 93
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    const v0, 0x7f1303f7

    .line 101
    .line 102
    .line 103
    if-ne p1, v0, :cond_2

    .line 104
    .line 105
    invoke-static {p0}, Ldefpackage/q05;->l(Ldefpackage/kc1;)Ldefpackage/v23;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    invoke-virtual {p0}, Ldefpackage/v23;->o()V

    .line 110
    .line 111
    .line 112
    :cond_2
    :goto_1
    return-void

    .line 113
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
