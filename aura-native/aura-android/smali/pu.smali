.class public final Lpu;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public a:J

.field public b:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    iput-wide v0, p0, Lpu;->a:J

    .line 10
    .line 11
    iput-wide v0, p0, Lpu;->b:J

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(IJJ)V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-wide p2, p0, Lpu;->a:J

    .line 16
    iput-wide p4, p0, Lpu;->b:J

    return-void
.end method

.method public constructor <init>(JJ)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-wide p1, p0, Lpu;->a:J

    .line 19
    iput-wide p3, p0, Lpu;->b:J

    return-void
.end method
