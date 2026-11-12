.class public final Lj63;
.super Ld0;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ls22;


# static fields
.field public static final o:Lj63;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lj63;

    .line 2
    .line 3
    sget-object v1, Lfz0;->h0:Lfz0;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ld0;-><init>(Lme0;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lj63;->o:Lj63;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final M(Lif1;)Las0;
    .locals 0

    .line 1
    sget-object p0, Lk63;->n:Lk63;

    .line 2
    .line 3
    return-object p0
.end method

.method public final R(Lwd0;)Ljava/lang/Object;
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string p1, "This job is always active"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final T(ZZLq;)Las0;
    .locals 0

    .line 1
    sget-object p0, Lk63;->n:Lk63;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final f(Ljava/util/concurrent/CancellationException;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final isCancelled()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final j(La32;)Lc20;
    .locals 0

    .line 1
    sget-object p0, Lk63;->n:Lk63;

    .line 2
    .line 3
    return-object p0
.end method

.method public final q()Ljava/util/concurrent/CancellationException;
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string v0, "This job is always active"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final start()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "NonCancellable"

    .line 2
    .line 3
    return-object p0
.end method
