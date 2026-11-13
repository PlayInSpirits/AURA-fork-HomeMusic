.class public final synthetic Ldefpackage/pm3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/util/function/BiConsumer;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistRowBottomSheetDialog;


# direct methods
.method public synthetic constructor <init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistRowBottomSheetDialog;I)V
    .locals 0

    .line 1
    iput p2, p0, Ldefpackage/pm3;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Ldefpackage/pm3;->b:Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistRowBottomSheetDialog;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget v0, p0, Ldefpackage/pm3;->a:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object p0, p0, Ldefpackage/pm3;->b:Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistRowBottomSheetDialog;

    .line 6
    .line 7
    check-cast p1, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 8
    .line 9
    check-cast p2, Ljava/util/List;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    new-instance v0, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {v0, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v0}, Ljava/util/Collections;->shuffle(Ljava/util/List;)V

    .line 20
    .line 21
    .line 22
    iget-object p2, p1, Lcom/eddyizm/tempus/ui/activity/MainActivity;->P:Ldefpackage/bl2;

    .line 23
    .line 24
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistRowBottomSheetDialog;->C0:Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getId()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-static {p0}, Ldefpackage/v13;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-static {p2, v0, v2, p0}, Ldefpackage/bo2;->q(Ldefpackage/ic2;Ljava/util/List;ILjava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget-object p0, p1, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Ldefpackage/zg5;

    .line 38
    .line 39
    iget-object p0, p0, Ldefpackage/zg5;->n:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p0, Ldefpackage/au;

    .line 42
    .line 43
    invoke-virtual {p0, v1}, Ldefpackage/au;->d(Z)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :pswitch_0
    iget-object v0, p1, Lcom/eddyizm/tempus/ui/activity/MainActivity;->P:Ldefpackage/bl2;

    .line 48
    .line 49
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistRowBottomSheetDialog;->C0:Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 50
    .line 51
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getId()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-static {p0}, Ldefpackage/v13;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-static {v0, p2, v2, p0}, Ldefpackage/bo2;->q(Ldefpackage/ic2;Ljava/util/List;ILjava/lang/String;)V

    .line 60
    .line 61
    .line 62
    iget-object p0, p1, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Ldefpackage/zg5;

    .line 63
    .line 64
    iget-object p0, p0, Ldefpackage/zg5;->n:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p0, Ldefpackage/au;

    .line 67
    .line 68
    invoke-virtual {p0, v1}, Ldefpackage/au;->d(Z)V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :pswitch_1
    invoke-static {}, Ldefpackage/ud3;->o()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    const/4 v1, 0x2

    .line 77
    if-nez v0, :cond_0

    .line 78
    .line 79
    invoke-static {p1}, Ldefpackage/au0;->w(Landroid/content/Context;)Ldefpackage/eu0;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-static {p2}, Ldefpackage/gi1;->H(Ljava/util/List;)Ljava/util/ArrayList;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-interface {p2}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    new-instance v3, Ldefpackage/t8;

    .line 92
    .line 93
    invoke-direct {v3, v1, p0}, Ldefpackage/t8;-><init>(ILjava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    invoke-interface {p2, v3}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    invoke-interface {p0, p2}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    check-cast p0, Ljava/util/List;

    .line 109
    .line 110
    invoke-virtual {p1, v0, p0, v2}, Ldefpackage/eu0;->a(Ljava/util/ArrayList;Ljava/util/List;Z)I

    .line 111
    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_0
    new-instance v0, Ldefpackage/xd0;

    .line 115
    .line 116
    invoke-direct {v0, v1, p0, p1}, Ldefpackage/xd0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    invoke-interface {p2, v0}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    .line 120
    .line 121
    .line 122
    :goto_0
    return-void

    .line 123
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
