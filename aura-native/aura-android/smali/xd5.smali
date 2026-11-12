.class public final Lxd5;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final a:Lxd5;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lxd5;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lxd5;->a:Lxd5;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/Paint;)J
    .locals 4

    .line 1
    sget p0, Lx40;->h:I

    .line 2
    .line 3
    invoke-static {p1}, Lfb5;->a(Landroid/graphics/Paint;)J

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    const-wide/16 v0, 0x3f

    .line 8
    .line 9
    and-long/2addr v0, p0

    .line 10
    const-wide/16 v2, 0x10

    .line 11
    .line 12
    cmp-long v2, v0, v2

    .line 13
    .line 14
    if-gez v2, :cond_0

    .line 15
    .line 16
    return-wide p0

    .line 17
    :cond_0
    const-wide/16 v2, -0x40

    .line 18
    .line 19
    and-long/2addr p0, v2

    .line 20
    const-wide/16 v2, 0x1

    .line 21
    .line 22
    add-long/2addr v0, v2

    .line 23
    or-long/2addr p0, v0

    .line 24
    return-wide p0
.end method

.method public final b(Landroid/graphics/Paint;I)V
    .locals 0

    .line 1
    invoke-static {p2}, Lq05;->A(I)Landroid/graphics/BlendMode;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p1, p0}, Lfb5;->d(Landroid/graphics/Paint;Landroid/graphics/BlendMode;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final c(Landroid/graphics/Paint;J)V
    .locals 2

    .line 1
    const-wide/16 v0, 0x3f

    .line 2
    .line 3
    and-long/2addr v0, p2

    .line 4
    long-to-int p0, v0

    .line 5
    sget-object v0, Ls50;->x:Lq83;

    .line 6
    .line 7
    iget v0, v0, Lp50;->c:I

    .line 8
    .line 9
    if-eq p0, v0, :cond_0

    .line 10
    .line 11
    sget-object v0, Ls50;->s:Ln42;

    .line 12
    .line 13
    iget v0, v0, Lp50;->c:I

    .line 14
    .line 15
    if-eq p0, v0, :cond_0

    .line 16
    .line 17
    sget-object v0, Ls50;->t:Ln42;

    .line 18
    .line 19
    iget v0, v0, Lp50;->c:I

    .line 20
    .line 21
    if-eq p0, v0, :cond_0

    .line 22
    .line 23
    invoke-static {p2, p3}, Luc5;->Z(J)J

    .line 24
    .line 25
    .line 26
    move-result-wide p2

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    sget-object p0, Ls50;->e:Lk24;

    .line 29
    .line 30
    invoke-static {p2, p3, p0}, Lx40;->a(JLp50;)J

    .line 31
    .line 32
    .line 33
    move-result-wide p2

    .line 34
    invoke-static {p2, p3}, Luc5;->Z(J)J

    .line 35
    .line 36
    .line 37
    move-result-wide p2

    .line 38
    :goto_0
    invoke-static {p1, p2, p3}, Lfb5;->c(Landroid/graphics/Paint;J)V

    .line 39
    .line 40
    .line 41
    return-void
.end method
