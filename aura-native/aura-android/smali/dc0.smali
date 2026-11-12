.class public final Ldc0;
.super Lwd0;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public n:Landroidx/work/impl/workers/ConstraintTrackingWorker;

.field public o:Loc2;

.field public synthetic p:Ljava/lang/Object;

.field public final synthetic q:Landroidx/work/impl/workers/ConstraintTrackingWorker;

.field public r:I


# direct methods
.method public constructor <init>(Landroidx/work/impl/workers/ConstraintTrackingWorker;Lwd0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ldc0;->q:Landroidx/work/impl/workers/ConstraintTrackingWorker;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lwd0;-><init>(Lvd0;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iput-object p1, p0, Ldc0;->p:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Ldc0;->r:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Ldc0;->r:I

    .line 9
    .line 10
    iget-object p1, p0, Ldc0;->q:Landroidx/work/impl/workers/ConstraintTrackingWorker;

    .line 11
    .line 12
    invoke-static {p1, p0}, Landroidx/work/impl/workers/ConstraintTrackingWorker;->f(Landroidx/work/impl/workers/ConstraintTrackingWorker;Lwd0;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method
