.class public final synthetic Lm25;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lne4;


# instance fields
.field public final synthetic n:J

.field public final synthetic o:J

.field public final synthetic p:J


# direct methods
.method public synthetic constructor <init>(JJJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lm25;->n:J

    .line 5
    .line 6
    iput-wide p3, p0, Lm25;->o:J

    .line 7
    .line 8
    iput-wide p5, p0, Lm25;->p:J

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final get()J
    .locals 4

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-wide v2, p0, Lm25;->o:J

    .line 6
    .line 7
    sub-long/2addr v0, v2

    .line 8
    iget-wide v2, p0, Lm25;->n:J

    .line 9
    .line 10
    add-long/2addr v0, v2

    .line 11
    iget-wide v2, p0, Lm25;->p:J

    .line 12
    .line 13
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    return-wide v0
.end method
