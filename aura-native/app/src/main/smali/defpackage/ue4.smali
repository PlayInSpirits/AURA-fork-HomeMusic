.class public final Ldefpackage/ue4;
.super Ljava/lang/Thread;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic n:Ldefpackage/ve4;


# direct methods
.method public constructor <init>(Ldefpackage/ve4;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ldefpackage/ue4;->n:Ldefpackage/ve4;

    .line 2
    .line 3
    const-string p1, "ExoPlayer:SimpleDecoder"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/ue4;->n:Ldefpackage/ve4;

    .line 2
    .line 3
    :goto_0
    :try_start_0
    invoke-virtual {p0}, Ldefpackage/ve4;->k()Z

    .line 4
    .line 5
    .line 6
    move-result v0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    return-void

    .line 11
    :catch_0
    move-exception p0

    .line 12
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 13
    .line 14
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 15
    .line 16
    .line 17
    throw v0
.end method
