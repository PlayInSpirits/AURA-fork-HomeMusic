.class public final Landroidx/compose/ui/input/pointer/PointerInputResetException;
.super Landroidx/compose/ui/internal/PlatformOptimizedCancellationException;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const-string v0, "Pointer input was reset"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
