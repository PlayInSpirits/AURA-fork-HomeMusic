.class public final synthetic Lxd0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lxd0;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lxd0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lxd0;->c:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 5

    .line 1
    iget v0, p0, Lxd0;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lxd0;->c:Ljava/lang/Object;

    .line 5
    .line 6
    iget-object p0, p0, Lxd0;->b:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistRowBottomSheetDialog;

    .line 12
    .line 13
    check-cast v2, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 14
    .line 15
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 16
    .line 17
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistRowBottomSheetDialog;->C0:Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getId()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistRowBottomSheetDialog;->C0:Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getName()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-static {v2, p1, v0, p0, v1}, Li51;->b(Landroid/content/Context;Lcom/eddyizm/tempus/subsonic/models/Child;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_0
    check-cast p0, Ljava/util/function/BiConsumer;

    .line 34
    .line 35
    check-cast v2, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 36
    .line 37
    check-cast p1, Ljava/util/List;

    .line 38
    .line 39
    invoke-interface {p0, v2, p1}, Ljava/util/function/BiConsumer;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :pswitch_1
    check-cast p0, Lyd0;

    .line 44
    .line 45
    check-cast v2, Lsp3;

    .line 46
    .line 47
    check-cast p1, Ljava/util/List;

    .line 48
    .line 49
    if-eqz p1, :cond_3

    .line 50
    .line 51
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_0

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_0
    move v0, v1

    .line 59
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-ge v0, v3, :cond_2

    .line 64
    .line 65
    iget-object v3, v2, Lsp3;->a:Ljava/lang/String;

    .line 66
    .line 67
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    check-cast v4, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 72
    .line 73
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    if-eqz v3, :cond_1

    .line 82
    .line 83
    iget-wide v3, v2, Lsp3;->b:J

    .line 84
    .line 85
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    check-cast v1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 90
    .line 91
    iget-object v2, v2, Lsp3;->h:Ljava/lang/String;

    .line 92
    .line 93
    invoke-virtual {v1, v2}, Lcom/eddyizm/tempus/subsonic/models/Child;->setType(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    move v1, v0

    .line 97
    goto :goto_1

    .line 98
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_2
    const-wide/16 v3, 0x0

    .line 102
    .line 103
    :goto_1
    iget-object p0, p0, Lyd0;->v:Lzd0;

    .line 104
    .line 105
    iget-object p0, p0, Lzd0;->s:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast p0, Lbl2;

    .line 108
    .line 109
    invoke-static {p0, p1, v1, v3, v4}, Lbo2;->p(Lic2;Ljava/util/List;IJ)V

    .line 110
    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_3
    :goto_2
    invoke-virtual {p0, v2}, Lyd0;->s(Lsp3;)V

    .line 114
    .line 115
    .line 116
    :goto_3
    return-void

    .line 117
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
