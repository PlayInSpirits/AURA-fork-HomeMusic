.class public final synthetic Lg7;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements La83;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lk03;


# direct methods
.method public synthetic constructor <init>(Lk03;I)V
    .locals 0

    .line 1
    iput p2, p0, Lg7;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lg7;->b:Lk03;

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
    .locals 1

    .line 1
    iget v0, p0, Lg7;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Lg7;->b:Lk03;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 9
    .line 10
    :goto_0
    invoke-virtual {p0, p1}, Lad2;->i(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :pswitch_1
    check-cast p1, Ljava/util/List;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
