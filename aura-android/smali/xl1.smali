.class public final Lxl1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lk51;


# instance fields
.field public final a:Lk51;

.field public final b:Z


# direct methods
.method public constructor <init>(I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    and-int/2addr p1, v0

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    iput-boolean v0, p0, Lxl1;->b:Z

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    new-instance p1, Ldf4;

    .line 15
    .line 16
    const-string v0, "image/heif"

    .line 17
    .line 18
    const/4 v1, -0x1

    .line 19
    invoke-direct {p1, v0, v1, v1}, Ldf4;-><init>(Ljava/lang/String;II)V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lxl1;->a:Lk51;

    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    new-instance p1, Lwl1;

    .line 26
    .line 27
    invoke-direct {p1}, Lwl1;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lxl1;->a:Lk51;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    .line 1
    iget-object p0, p0, Lxl1;->a:Lk51;

    .line 2
    .line 3
    invoke-interface {p0}, Lk51;->a()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final b(Ll51;Lt71;)I
    .locals 0

    .line 1
    iget-object p0, p0, Lxl1;->a:Lk51;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Lk51;->b(Ll51;Lt71;)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final c(Ll51;)Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lxl1;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    check-cast p1, Lrk0;

    .line 7
    .line 8
    invoke-static {p1, p0}, Lji2;->S(Lrk0;Z)Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0

    .line 13
    :cond_0
    iget-object p0, p0, Lxl1;->a:Lk51;

    .line 14
    .line 15
    invoke-interface {p0, p1}, Lk51;->c(Ll51;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0
.end method

.method public final d(JJ)V
    .locals 0

    .line 1
    iget-object p0, p0, Lxl1;->a:Lk51;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2, p3, p4}, Lk51;->d(JJ)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final f(Lm51;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lxl1;->a:Lk51;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lk51;->f(Lm51;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
