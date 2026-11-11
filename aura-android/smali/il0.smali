.class public final Lil0;
.super Lx21;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/util/concurrent/Executor;


# static fields
.field public static final p:Lil0;

.field public static final q:Lpe0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lil0;

    .line 2
    .line 3
    invoke-direct {v0}, Lpe0;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lil0;->p:Lil0;

    .line 7
    .line 8
    sget-object v0, Ln15;->p:Ln15;

    .line 9
    .line 10
    sget v1, Leq4;->a:I

    .line 11
    .line 12
    const/16 v2, 0x40

    .line 13
    .line 14
    if-ge v2, v1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v1, v2

    .line 18
    :goto_0
    const/16 v2, 0xc

    .line 19
    .line 20
    const-string v3, "kotlinx.coroutines.io.parallelism"

    .line 21
    .line 22
    invoke-static {v3, v1, v2}, Lkb4;->W(Ljava/lang/String;II)I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    invoke-virtual {v0, v1}, Ln15;->Z(I)Lpe0;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sput-object v0, Lil0;->q:Lpe0;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final W(Lne0;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    sget-object p0, Lil0;->q:Lpe0;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lpe0;->W(Lne0;Ljava/lang/Runnable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final X(Lne0;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    sget-object p0, Lil0;->q:Lpe0;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lpe0;->X(Lne0;Ljava/lang/Runnable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final close()V
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string v0, "Cannot be invoked on Dispatchers.IO"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final execute(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    sget-object v0, Lq01;->n:Lq01;

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1}, Lil0;->W(Lne0;Ljava/lang/Runnable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "Dispatchers.IO"

    .line 2
    .line 3
    return-object p0
.end method
