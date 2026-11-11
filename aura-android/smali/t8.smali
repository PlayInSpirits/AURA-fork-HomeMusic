.class public final synthetic Lt8;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lt8;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lt8;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lt8;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Lt8;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lss0;

    .line 9
    .line 10
    check-cast p1, Lol1;

    .line 11
    .line 12
    invoke-virtual {p0}, Lss0;->B()Ljava/util/Map;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Ljava/util/HashMap;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, Ljava/lang/Double;

    .line 23
    .line 24
    return-object p0

    .line 25
    :pswitch_0
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistRowBottomSheetDialog;

    .line 26
    .line 27
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 28
    .line 29
    new-instance v0, Lcom/eddyizm/tempus/model/Download;

    .line 30
    .line 31
    invoke-direct {v0, p1}, Lcom/eddyizm/tempus/model/Download;-><init>(Lcom/eddyizm/tempus/subsonic/models/Child;)V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistRowBottomSheetDialog;->C0:Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 35
    .line 36
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getId()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {v0, p1}, Lcom/eddyizm/tempus/model/Download;->setPlaylistId(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistRowBottomSheetDialog;->C0:Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getName()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {v0, p0}, Lcom/eddyizm/tempus/model/Download;->setPlaylistName(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-object v0

    .line 53
    :pswitch_1
    check-cast p0, Lgy0;

    .line 54
    .line 55
    check-cast p1, Ld64;

    .line 56
    .line 57
    return-object p0

    .line 58
    :pswitch_2
    check-cast p0, Lv8;

    .line 59
    .line 60
    check-cast p1, Ljava/lang/String;

    .line 61
    .line 62
    iget-object p0, p0, Lv8;->u:Ljava/util/List;

    .line 63
    .line 64
    invoke-interface {p0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    xor-int/lit8 p0, p0, 0x1

    .line 69
    .line 70
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    return-object p0

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
