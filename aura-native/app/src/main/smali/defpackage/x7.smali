.class public final Ldefpackage/x7;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lretrofit2/Callback;
.implements Lcom/eddyizm/tempus/interfaces/DecadesCallback;
.implements Ldefpackage/d14;
.implements Ldefpackage/f4;
.implements Ldefpackage/xs;
.implements Ldefpackage/th4;
.implements Ldefpackage/j45;


# instance fields
.field public final synthetic n:I

.field public o:I

.field public p:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    iput p1, p0, Ldefpackage/x7;->n:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object p1, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Ldefpackage/x7;->p:Ljava/lang/Object;

    .line 12
    .line 13
    const/16 p1, 0x64

    .line 14
    .line 15
    iput p1, p0, Ldefpackage/x7;->o:I

    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    .line 20
    .line 21
    new-instance p1, Ldefpackage/be3;

    .line 22
    .line 23
    const/16 v0, 0x8

    .line 24
    .line 25
    invoke-direct {p1, v0}, Ldefpackage/be3;-><init>(I)V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Ldefpackage/x7;->p:Ljava/lang/Object;

    .line 29
    .line 30
    return-void

    :pswitch_data_0
    .packed-switch 0xd
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic constructor <init>(IILjava/lang/Object;)V
    .locals 0

    .line 32
    iput p2, p0, Ldefpackage/x7;->n:I

    iput-object p3, p0, Ldefpackage/x7;->p:Ljava/lang/Object;

    iput p1, p0, Ldefpackage/x7;->o:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(ILdefpackage/ry0;)V
    .locals 2

    const/16 v0, 0x11

    iput v0, p0, Ldefpackage/x7;->n:I

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    iput p1, p0, Ldefpackage/x7;->o:I

    .line 50
    new-instance v0, Ldefpackage/ss0;

    new-instance v1, Ldefpackage/e81;

    invoke-direct {v1, p1, p2}, Ldefpackage/e81;-><init>(ILdefpackage/ry0;)V

    invoke-direct {v0, v1}, Ldefpackage/ss0;-><init>(Ldefpackage/c81;)V

    iput-object v0, p0, Ldefpackage/x7;->p:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(ILdefpackage/wi4;)V
    .locals 1

    const/16 v0, 0xe

    iput v0, p0, Ldefpackage/x7;->n:I

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ldefpackage/x7;->o:I

    iput-object p2, p0, Ldefpackage/x7;->p:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(IZ)V
    .locals 0

    .line 31
    iput p1, p0, Ldefpackage/x7;->n:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, Ldefpackage/x7;->n:I

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p1, p0, Ldefpackage/x7;->p:Ljava/lang/Object;

    const/4 p1, -0x1

    .line 40
    iput p1, p0, Ldefpackage/x7;->o:I

    return-void
.end method

.method public constructor <init>(Landroidx/media3/session/MediaLibraryService;)V
    .locals 1

    const/4 v0, 0x6

    iput v0, p0, Ldefpackage/x7;->n:I

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 42
    iput v0, p0, Ldefpackage/x7;->o:I

    .line 43
    iput-object p1, p0, Ldefpackage/x7;->p:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 1

    const/16 v0, 0xb

    iput v0, p0, Ldefpackage/x7;->n:I

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldefpackage/x7;->p:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(ZZZ)V
    .locals 1

    const/16 v0, 0x9

    iput v0, p0, Ldefpackage/x7;->n:I

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p1, :cond_1

    if-nez p2, :cond_1

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 47
    :goto_1
    iput p1, p0, Ldefpackage/x7;->o:I

    return-void
.end method

.method public constructor <init>([II)V
    .locals 1

    const/16 v0, 0x10

    iput v0, p0, Ldefpackage/x7;->n:I

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput p2, p0, Ldefpackage/x7;->o:I

    if-eqz p1, :cond_1

    .line 35
    sget-object p2, Ldefpackage/tw1;->p:Ldefpackage/tw1;

    .line 36
    array-length p2, p1

    if-nez p2, :cond_0

    sget-object p1, Ldefpackage/tw1;->p:Ldefpackage/tw1;

    goto :goto_0

    :cond_0
    new-instance p2, Ldefpackage/tw1;

    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object p1

    invoke-direct {p2, p1}, Ldefpackage/tw1;-><init>([I)V

    move-object p1, p2

    goto :goto_0

    .line 37
    :cond_1
    sget-object p1, Ldefpackage/tw1;->p:Ldefpackage/tw1;

    :goto_0
    iput-object p1, p0, Ldefpackage/x7;->p:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public b(Ldefpackage/kn2;I)Landroid/content/Intent;
    .locals 2

    .line 1
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    const-string v1, "android.intent.action.MEDIA_BUTTON"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p1, Ldefpackage/kn2;->a:Ldefpackage/tn2;

    .line 9
    .line 10
    iget-object p1, p1, Ldefpackage/tn2;->b:Landroid/net/Uri;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 13
    .line 14
    .line 15
    new-instance p1, Landroid/content/ComponentName;

    .line 16
    .line 17
    iget-object p0, p0, Ldefpackage/x7;->p:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, Landroidx/media3/session/MediaLibraryService;

    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-direct {p1, p0, v1}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 29
    .line 30
    .line 31
    new-instance p0, Landroid/view/KeyEvent;

    .line 32
    .line 33
    const/4 p1, 0x0

    .line 34
    invoke-direct {p0, p1, p2}, Landroid/view/KeyEvent;-><init>(II)V

    .line 35
    .line 36
    .line 37
    const-string p1, "android.intent.extra.KEY_EVENT"

    .line 38
    .line 39
    invoke-virtual {v0, p1, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 40
    .line 41
    .line 42
    return-object v0
.end method

.method public c(Ldefpackage/rk0;)J
    .locals 7

    .line 1
    iget-object v0, p0, Ldefpackage/x7;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldefpackage/be3;

    .line 4
    .line 5
    iget-object v1, v0, Ldefpackage/be3;->a:[B

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    invoke-virtual {p1, v1, v2, v3, v2}, Ldefpackage/rk0;->e([BIIZ)Z

    .line 10
    .line 11
    .line 12
    iget-object v1, v0, Ldefpackage/be3;->a:[B

    .line 13
    .line 14
    aget-byte v1, v1, v2

    .line 15
    .line 16
    and-int/lit16 v1, v1, 0xff

    .line 17
    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    const-wide/high16 p0, -0x8000000000000000L

    .line 21
    .line 22
    return-wide p0

    .line 23
    :cond_0
    const/16 v4, 0x80

    .line 24
    .line 25
    move v5, v2

    .line 26
    :goto_0
    and-int v6, v1, v4

    .line 27
    .line 28
    if-nez v6, :cond_1

    .line 29
    .line 30
    shr-int/lit8 v4, v4, 0x1

    .line 31
    .line 32
    add-int/lit8 v5, v5, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    not-int v4, v4

    .line 36
    and-int/2addr v1, v4

    .line 37
    iget-object v4, v0, Ldefpackage/be3;->a:[B

    .line 38
    .line 39
    invoke-virtual {p1, v4, v3, v5, v2}, Ldefpackage/rk0;->e([BIIZ)Z

    .line 40
    .line 41
    .line 42
    :goto_1
    if-ge v2, v5, :cond_2

    .line 43
    .line 44
    shl-int/lit8 p1, v1, 0x8

    .line 45
    .line 46
    iget-object v1, v0, Ldefpackage/be3;->a:[B

    .line 47
    .line 48
    add-int/lit8 v2, v2, 0x1

    .line 49
    .line 50
    aget-byte v1, v1, v2

    .line 51
    .line 52
    and-int/lit16 v1, v1, 0xff

    .line 53
    .line 54
    add-int/2addr v1, p1

    .line 55
    goto :goto_1

    .line 56
    :cond_2
    iget p1, p0, Ldefpackage/x7;->o:I

    .line 57
    .line 58
    add-int/2addr v5, v3

    .line 59
    add-int/2addr v5, p1

    .line 60
    iput v5, p0, Ldefpackage/x7;->o:I

    .line 61
    .line 62
    int-to-long p0, v1

    .line 63
    return-wide p0
.end method

.method public d(JLdefpackage/ce;Ldefpackage/ce;Ldefpackage/ce;)Ldefpackage/ce;
    .locals 6

    .line 1
    iget-object p0, p0, Ldefpackage/x7;->p:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    check-cast v0, Ldefpackage/ss0;

    .line 5
    .line 6
    move-wide v1, p1

    .line 7
    move-object v3, p3

    .line 8
    move-object v4, p4

    .line 9
    move-object v5, p5

    .line 10
    invoke-virtual/range {v0 .. v5}, Ldefpackage/ss0;->d(JLdefpackage/ce;Ldefpackage/ce;Ldefpackage/ce;)Ldefpackage/ce;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public g(Landroid/net/Uri;)Ldefpackage/ic2;
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/x7;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldefpackage/xs;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Ldefpackage/xs;->g(Landroid/net/Uri;)Ldefpackage/ic2;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    new-instance v0, Ldefpackage/ss2;

    .line 10
    .line 11
    const/16 v1, 0x11

    .line 12
    .line 13
    invoke-direct {v0, v1, p0}, Ldefpackage/ss2;-><init>(ILjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-static {p1, v0}, Ldefpackage/hw;->O(Ldefpackage/ic2;Ldefpackage/eg1;)Ldefpackage/p2;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public h(Landroid/view/View;)Z
    .locals 0

    .line 1
    iget-object p1, p0, Ldefpackage/x7;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 4
    .line 5
    iget p0, p0, Ldefpackage/x7;->o:I

    .line 6
    .line 7
    invoke-virtual {p1, p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->J(I)V

    .line 8
    .line 9
    .line 10
    const/4 p0, 0x1

    .line 11
    return p0
.end method

.method public i(Ldefpackage/do2;)Ldefpackage/ic2;
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/x7;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldefpackage/xs;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Ldefpackage/xs;->i(Ldefpackage/do2;)Ldefpackage/ic2;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0

    .line 13
    :cond_0
    new-instance v0, Ldefpackage/ss2;

    .line 14
    .line 15
    const/16 v1, 0x11

    .line 16
    .line 17
    invoke-direct {v0, v1, p0}, Ldefpackage/ss2;-><init>(ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-static {p1, v0}, Ldefpackage/hw;->O(Ldefpackage/ic2;Ldefpackage/eg1;)Ldefpackage/p2;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public j([B)Ldefpackage/ic2;
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/x7;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldefpackage/xs;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Ldefpackage/xs;->j([B)Ldefpackage/ic2;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    new-instance v0, Ldefpackage/ss2;

    .line 10
    .line 11
    const/16 v1, 0x11

    .line 12
    .line 13
    invoke-direct {v0, v1, p0}, Ldefpackage/ss2;-><init>(ILjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-static {p1, v0}, Ldefpackage/hw;->O(Ldefpackage/ic2;Ldefpackage/eg1;)Ldefpackage/p2;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public k(JLdefpackage/ce;Ldefpackage/ce;Ldefpackage/ce;)Ldefpackage/ce;
    .locals 6

    .line 1
    iget-object p0, p0, Ldefpackage/x7;->p:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    check-cast v0, Ldefpackage/ss0;

    .line 5
    .line 6
    move-wide v1, p1

    .line 7
    move-object v3, p3

    .line 8
    move-object v4, p4

    .line 9
    move-object v5, p5

    .line 10
    invoke-virtual/range {v0 .. v5}, Ldefpackage/ss0;->k(JLdefpackage/ce;Ldefpackage/ce;Ldefpackage/ce;)Ldefpackage/ce;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public m(Ldefpackage/ce;Ldefpackage/ce;Ldefpackage/ce;)J
    .locals 0

    .line 1
    iget p0, p0, Ldefpackage/x7;->o:I

    .line 2
    .line 3
    int-to-long p0, p0

    .line 4
    const-wide/32 p2, 0xf4240

    .line 5
    .line 6
    .line 7
    mul-long/2addr p0, p2

    .line 8
    return-wide p0
.end method

.method public onFailure(Lretrofit2/Call;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    iget p1, p0, Ldefpackage/x7;->n:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string p0, "SongRepository"

    .line 7
    .line 8
    const-string p1, "fetchAlbumSongsThenSimilar.onFailure()"

    .line 9
    .line 10
    invoke-static {p0, p1, p2}, Landroid/util/Ldefpackage/og;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    iget-object p1, p0, Ldefpackage/x7;->p:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p1, Ldefpackage/zg5;

    .line 17
    .line 18
    iget p0, p0, Ldefpackage/x7;->o:I

    .line 19
    .line 20
    const/4 p2, 0x0

    .line 21
    invoke-static {p0, p2}, Ldefpackage/kb4;->a(ILjava/util/ArrayList;)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p1, p0}, Ldefpackage/zg5;->onLoadMedia(Ljava/util/List;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public onLoadYear(I)V
    .locals 3

    .line 1
    iget v0, p0, Ldefpackage/x7;->o:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq v0, v1, :cond_1

    .line 5
    .line 6
    if-eq p1, v1, :cond_1

    .line 7
    .line 8
    new-instance v1, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    rem-int/lit8 v2, v0, 0xa

    .line 14
    .line 15
    sub-int/2addr v0, v2

    .line 16
    rem-int/lit8 v2, p1, 0xa

    .line 17
    .line 18
    sub-int/2addr p1, v2

    .line 19
    :goto_0
    if-gt v0, p1, :cond_0

    .line 20
    .line 21
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    add-int/lit8 v0, v0, 0xa

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    iget-object p0, p0, Ldefpackage/x7;->p:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p0, Ldefpackage/r8;

    .line 34
    .line 35
    iget-object p0, p0, Ldefpackage/r8;->o:Ldefpackage/k03;

    .line 36
    .line 37
    invoke-virtual {p0, v1}, Ldefpackage/ad2;->k(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    return-void
.end method

.method public onResponse(Lretrofit2/Call;Lretrofit2/Response;)V
    .locals 1

    .line 1
    iget p1, p0, Ldefpackage/x7;->n:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Lretrofit2/Response;->isSuccessful()Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p1, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 23
    .line 24
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getAlbum()Lcom/eddyizm/tempus/subsonic/models/AlbumWithSongsID3;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    if-eqz p1, :cond_0

    .line 33
    .line 34
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    check-cast p1, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 39
    .line 40
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getAlbum()Lcom/eddyizm/tempus/subsonic/models/AlbumWithSongsID3;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumWithSongsID3;->getSongs()Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    if-eqz p1, :cond_0

    .line 53
    .line 54
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    if-nez p2, :cond_0

    .line 59
    .line 60
    iget p2, p0, Ldefpackage/x7;->o:I

    .line 61
    .line 62
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    .line 67
    .line 68
    .line 69
    move-result p2

    .line 70
    const/4 v0, 0x0

    .line 71
    invoke-interface {p1, v0, p2}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    iget-object p0, p0, Ldefpackage/x7;->p:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast p0, Ldefpackage/wi4;

    .line 78
    .line 79
    new-instance p2, Ljava/util/ArrayList;

    .line 80
    .line 81
    invoke-direct {p2, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0, p2}, Ldefpackage/wi4;->a(Ljava/util/List;)V

    .line 85
    .line 86
    .line 87
    :cond_0
    return-void

    .line 88
    :pswitch_0
    iget p1, p0, Ldefpackage/x7;->o:I

    .line 89
    .line 90
    iget-object p0, p0, Ldefpackage/x7;->p:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast p0, Ldefpackage/zg5;

    .line 93
    .line 94
    invoke-virtual {p2}, Lretrofit2/Response;->isSuccessful()Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-eqz v0, :cond_1

    .line 99
    .line 100
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    if-eqz v0, :cond_1

    .line 105
    .line 106
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    check-cast v0, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 111
    .line 112
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getAlbumList2()Lcom/eddyizm/tempus/subsonic/models/AlbumList2;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    if-eqz v0, :cond_1

    .line 121
    .line 122
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    check-cast v0, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 127
    .line 128
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getAlbumList2()Lcom/eddyizm/tempus/subsonic/models/AlbumList2;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/AlbumList2;->getAlbums()Ljava/util/List;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    if-eqz v0, :cond_1

    .line 141
    .line 142
    new-instance v0, Ljava/util/ArrayList;

    .line 143
    .line 144
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object p2

    .line 148
    check-cast p2, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 149
    .line 150
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 151
    .line 152
    .line 153
    move-result-object p2

    .line 154
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getAlbumList2()Lcom/eddyizm/tempus/subsonic/models/AlbumList2;

    .line 155
    .line 156
    .line 157
    move-result-object p2

    .line 158
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/AlbumList2;->getAlbums()Ljava/util/List;

    .line 159
    .line 160
    .line 161
    move-result-object p2

    .line 162
    invoke-direct {v0, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 163
    .line 164
    .line 165
    invoke-static {p1, v0}, Ldefpackage/kb4;->a(ILjava/util/ArrayList;)Ljava/util/List;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    invoke-virtual {p0, p1}, Ldefpackage/zg5;->onLoadMedia(Ljava/util/List;)V

    .line 170
    .line 171
    .line 172
    goto :goto_0

    .line 173
    :cond_1
    const/4 p2, 0x0

    .line 174
    invoke-static {p1, p2}, Ldefpackage/kb4;->a(ILjava/util/ArrayList;)Ljava/util/List;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    invoke-virtual {p0, p1}, Ldefpackage/zg5;->onLoadMedia(Ljava/util/List;)V

    .line 179
    .line 180
    .line 181
    :goto_0
    return-void

    .line 182
    nop

    .line 183
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public q(Ldefpackage/q04;Ldefpackage/db3;)Ldefpackage/q04;
    .locals 2

    .line 1
    new-instance p2, Ljava/io/ByteArrayOutputStream;

    .line 2
    .line 3
    invoke-direct {p2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ldefpackage/q04;->get()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Landroid/graphics/Bitmap;

    .line 11
    .line 12
    iget-object v1, p0, Ldefpackage/x7;->p:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Landroid/graphics/Bitmap$CompressFormat;

    .line 15
    .line 16
    iget p0, p0, Ldefpackage/x7;->o:I

    .line 17
    .line 18
    invoke-virtual {v0, v1, p0, p2}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 19
    .line 20
    .line 21
    invoke-interface {p1}, Ldefpackage/q04;->b()V

    .line 22
    .line 23
    .line 24
    new-instance p0, Ldefpackage/ld;

    .line 25
    .line 26
    invoke-virtual {p2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-direct {p0, p1}, Ldefpackage/ld;-><init>([B)V

    .line 31
    .line 32
    .line 33
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    iget v0, p0, Ldefpackage/x7;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    iget-object v1, p0, Ldefpackage/x7;->p:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Ldefpackage/tw1;

    .line 16
    .line 17
    iget v2, v1, Ldefpackage/tw1;->o:I

    .line 18
    .line 19
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 20
    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    :goto_0
    iget v3, v1, Ldefpackage/tw1;->o:I

    .line 24
    .line 25
    if-ge v2, v3, :cond_0

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ldefpackage/tw1;->a(I)I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    invoke-static {v3}, Ldefpackage/f35;->g0(I)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    add-int/lit8 v2, v2, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    const-string v2, "UnsupportedBrands{major="

    .line 44
    .line 45
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    iget p0, p0, Ldefpackage/x7;->o:I

    .line 49
    .line 50
    invoke-static {p0}, Ldefpackage/f35;->g0(I)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string p0, ", compatible="

    .line 58
    .line 59
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string p0, "}"

    .line 66
    .line 67
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    return-object p0

    .line 75
    :pswitch_data_0
    .packed-switch 0x10
        :pswitch_0
    .end packed-switch
.end method
