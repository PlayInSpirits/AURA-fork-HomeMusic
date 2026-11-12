.class public final Lcom/eddyizm/tempus/homemusic/WaveRetry;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final $stable:I

.field private static final BACKOFF_MS:[J

.field public static final INSTANCE:Lcom/eddyizm/tempus/homemusic/WaveRetry;

.field public static final MAX_FAILURES:I = 0x10

.field private static final MAX_POLLS:I = 0xf

.field public static final POLL_MS:J = 0xfa0L


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/eddyizm/tempus/homemusic/WaveRetry;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/eddyizm/tempus/homemusic/WaveRetry;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/eddyizm/tempus/homemusic/WaveRetry;->INSTANCE:Lcom/eddyizm/tempus/homemusic/WaveRetry;

    .line 7
    .line 8
    const/4 v0, 0x6

    .line 9
    new-array v0, v0, [J

    .line 10
    .line 11
    fill-array-data v0, :array_0

    .line 12
    .line 13
    .line 14
    sput-object v0, Lcom/eddyizm/tempus/homemusic/WaveRetry;->BACKOFF_MS:[J

    .line 15
    .line 16
    const/16 v0, 0x8

    .line 17
    .line 18
    sput v0, Lcom/eddyizm/tempus/homemusic/WaveRetry;->$stable:I

    .line 19
    .line 20
    return-void

    .line 21
    :array_0
    .array-data 8
        0x1388
        0x3a98
        0x7530
        0xea60
        0x1d4c0
        0x493e0
    .end array-data
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final afterFailure(I)Ljava/lang/Long;
    .locals 2

    .line 1
    const/16 p0, 0x10

    .line 2
    .line 3
    if-le p1, p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return-object p0

    .line 7
    :cond_0
    sget-object p0, Lcom/eddyizm/tempus/homemusic/WaveRetry;->BACKOFF_MS:[J

    .line 8
    .line 9
    add-int/lit8 p1, p1, -0x1

    .line 10
    .line 11
    array-length v0, p0

    .line 12
    add-int/lit8 v0, v0, -0x1

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-static {p1, v1, v0}, Lgb;->m(III)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    aget-wide v0, p0, p1

    .line 20
    .line 21
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method

.method public final afterPending(I)Ljava/lang/Long;
    .locals 1

    .line 1
    const/16 v0, 0xf

    .line 2
    .line 3
    if-gt p1, v0, :cond_0

    .line 4
    .line 5
    const-wide/16 p0, 0xfa0

    .line 6
    .line 7
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    sub-int/2addr p1, v0

    .line 13
    invoke-virtual {p0, p1}, Lcom/eddyizm/tempus/homemusic/WaveRetry;->afterFailure(I)Ljava/lang/Long;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
