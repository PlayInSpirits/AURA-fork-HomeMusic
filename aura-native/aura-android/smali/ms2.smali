.class public final Lms2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Los2;


# direct methods
.method public constructor <init>(Landroid/media/session/MediaSessionManager$RemoteUserInfo;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lsr0;->o(Landroid/media/session/MediaSessionManager$RemoteUserInfo;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    new-instance v0, Lns2;

    .line 18
    .line 19
    invoke-static {p1}, Lsr0;->o(Landroid/media/session/MediaSessionManager$RemoteUserInfo;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-static {p1}, Lsr0;->b(Landroid/media/session/MediaSessionManager$RemoteUserInfo;)I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    invoke-static {p1}, Lsr0;->u(Landroid/media/session/MediaSessionManager$RemoteUserInfo;)I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    invoke-direct {v0, v1, v2, p1}, Los2;-><init>(Ljava/lang/String;II)V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, Lms2;->a:Los2;

    .line 35
    .line 36
    return-void

    .line 37
    :cond_0
    const-string p0, "packageName should be nonempty"

    .line 38
    .line 39
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw v1

    .line 43
    :cond_1
    const-string p0, "package shouldn\'t be null"

    .line 44
    .line 45
    invoke-static {p0}, Lnz2;->n(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw v1
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 2

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    .line 50
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 51
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    .line 52
    new-instance v0, Lns2;

    .line 53
    invoke-direct {v0, p1, p2, p3}, Los2;-><init>(Ljava/lang/String;II)V

    .line 54
    iput-object v0, p0, Lms2;->a:Los2;

    return-void

    .line 55
    :cond_0
    new-instance v0, Los2;

    invoke-direct {v0, p1, p2, p3}, Los2;-><init>(Ljava/lang/String;II)V

    iput-object v0, p0, Lms2;->a:Los2;

    return-void

    .line 56
    :cond_1
    const-string p0, "packageName should be nonempty"

    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    throw v0

    .line 57
    :cond_2
    const-string p0, "package shouldn\'t be null"

    invoke-static {p0}, Lnz2;->n(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    return p0

    .line 5
    :cond_0
    instance-of v0, p1, Lms2;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return p0

    .line 11
    :cond_1
    check-cast p1, Lms2;

    .line 12
    .line 13
    iget-object p1, p1, Lms2;->a:Los2;

    .line 14
    .line 15
    iget-object p0, p0, Lms2;->a:Los2;

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Los2;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lms2;->a:Los2;

    .line 2
    .line 3
    invoke-virtual {p0}, Los2;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
