.class public final Ln62;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public a:F

.field public b:F

.field public c:F

.field public d:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/high16 v0, 0x3f800000    # 1.0f

    .line 5
    .line 6
    iput v0, p0, Ln62;->a:F

    .line 7
    .line 8
    iput v0, p0, Ln62;->b:F

    .line 9
    .line 10
    const/high16 v0, 0x41000000    # 8.0f

    .line 11
    .line 12
    iput v0, p0, Ln62;->c:F

    .line 13
    .line 14
    sget v0, Ltw4;->b:I

    .line 15
    .line 16
    sget-wide v0, Ltw4;->a:J

    .line 17
    .line 18
    iput-wide v0, p0, Ln62;->d:J

    .line 19
    .line 20
    return-void
.end method
