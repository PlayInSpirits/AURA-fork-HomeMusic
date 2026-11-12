.class public abstract Led3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final a:Ldd3;

.field public static final b:Lqc3;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    .line 1
    new-instance v10, Ldd3;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {v10, v0}, Ldd3;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v10, Led3;->a:Ldd3;

    .line 8
    .line 9
    sget-object v7, Lrv2;->C:Lrv2;

    .line 10
    .line 11
    new-instance v8, Lcd3;

    .line 12
    .line 13
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    sget-object v1, Lq01;->n:Lq01;

    .line 17
    .line 18
    invoke-static {v1}, Lte5;->a(Lne0;)Ltd0;

    .line 19
    .line 20
    .line 21
    move-result-object v9

    .line 22
    const/16 v1, 0xf

    .line 23
    .line 24
    invoke-static {v0, v0, v1}, Lqc0;->b(III)J

    .line 25
    .line 26
    .line 27
    move-result-wide v11

    .line 28
    new-instance v0, Lqc3;

    .line 29
    .line 30
    const/4 v5, 0x0

    .line 31
    const/4 v6, 0x0

    .line 32
    const/4 v1, 0x0

    .line 33
    const/4 v2, 0x0

    .line 34
    const/4 v3, 0x0

    .line 35
    const/4 v4, 0x0

    .line 36
    invoke-direct/range {v0 .. v12}, Lqc3;-><init>(IIIIIILrv2;Lvi2;Lwe0;Loo0;J)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Led3;->b:Lqc3;

    .line 40
    .line 41
    return-void
.end method

.method public static final a(Lqc3;I)J
    .locals 6

    .line 1
    iget v0, p0, Lqc3;->c:I

    .line 2
    .line 3
    iget v1, p0, Lqc3;->b:I

    .line 4
    .line 5
    add-int/2addr v1, v0

    .line 6
    int-to-long v2, p1

    .line 7
    int-to-long v4, v1

    .line 8
    mul-long/2addr v2, v4

    .line 9
    iget p1, p0, Lqc3;->f:I

    .line 10
    .line 11
    neg-int p1, p1

    .line 12
    int-to-long v4, p1

    .line 13
    add-long/2addr v2, v4

    .line 14
    iget p1, p0, Lqc3;->d:I

    .line 15
    .line 16
    int-to-long v4, p1

    .line 17
    add-long/2addr v2, v4

    .line 18
    int-to-long v0, v0

    .line 19
    sub-long/2addr v2, v0

    .line 20
    iget-object p1, p0, Lqc3;->e:Lhb3;

    .line 21
    .line 22
    sget-object v0, Lhb3;->o:Lhb3;

    .line 23
    .line 24
    if-ne p1, v0, :cond_0

    .line 25
    .line 26
    invoke-virtual {p0}, Lqc3;->i()J

    .line 27
    .line 28
    .line 29
    move-result-wide v0

    .line 30
    const/16 p1, 0x20

    .line 31
    .line 32
    shr-long/2addr v0, p1

    .line 33
    :goto_0
    long-to-int p1, v0

    .line 34
    goto :goto_1

    .line 35
    :cond_0
    invoke-virtual {p0}, Lqc3;->i()J

    .line 36
    .line 37
    .line 38
    move-result-wide v0

    .line 39
    const-wide v4, 0xffffffffL

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    and-long/2addr v0, v4

    .line 45
    goto :goto_0

    .line 46
    :goto_1
    iget-object p0, p0, Lqc3;->n:Lrv2;

    .line 47
    .line 48
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    const/4 p0, 0x0

    .line 52
    invoke-static {p0, p0, p1}, Lgb;->m(III)I

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    sub-int/2addr p1, p0

    .line 57
    int-to-long p0, p1

    .line 58
    sub-long/2addr v2, p0

    .line 59
    const-wide/16 p0, 0x0

    .line 60
    .line 61
    cmp-long v0, v2, p0

    .line 62
    .line 63
    if-gez v0, :cond_1

    .line 64
    .line 65
    return-wide p0

    .line 66
    :cond_1
    return-wide v2
.end method
