.class public final synthetic Lnu3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements La83;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lou3;


# direct methods
.method public synthetic constructor <init>(Lou3;I)V
    .locals 0

    .line 1
    iput p2, p0, Lnu3;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lnu3;->b:Lou3;

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
    .locals 2

    .line 1
    iget v0, p0, Lnu3;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, Lnu3;->b:Lou3;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 10
    .line 11
    iget-object p0, p0, Lou3;->B0:Lwo0;

    .line 12
    .line 13
    iget-object p0, p0, Lwo0;->o:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Landroid/widget/RatingBar;

    .line 16
    .line 17
    invoke-virtual {p0, v1}, Landroid/widget/RatingBar;->setRating(F)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_0
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 22
    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    iget-object p0, p0, Lou3;->B0:Lwo0;

    .line 26
    .line 27
    iget-object p0, p0, Lwo0;->o:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p0, Landroid/widget/RatingBar;

    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getUserRating()Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getUserRating()Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    int-to-float v1, p1

    .line 46
    :cond_0
    invoke-virtual {p0, v1}, Landroid/widget/RatingBar;->setRating(F)V

    .line 47
    .line 48
    .line 49
    :cond_1
    return-void

    .line 50
    :pswitch_1
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 51
    .line 52
    iget-object p0, p0, Lou3;->B0:Lwo0;

    .line 53
    .line 54
    iget-object p0, p0, Lwo0;->o:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p0, Landroid/widget/RatingBar;

    .line 57
    .line 58
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getUserRating()Ljava/lang/Integer;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    if-eqz v0, :cond_2

    .line 63
    .line 64
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getUserRating()Ljava/lang/Integer;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    int-to-float v1, p1

    .line 73
    :cond_2
    invoke-virtual {p0, v1}, Landroid/widget/RatingBar;->setRating(F)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
