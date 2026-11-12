.class public final Lfi3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Le55;

.field public c:Lii3;

.field public d:Z

.field public e:Lvp4;

.field public f:Z

.field public g:J

.field public final h:Lf55;


# direct methods
.method public constructor <init>(Landroid/content/Context;Le55;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lfi3;->a:Landroid/content/Context;

    .line 9
    .line 10
    iput-object p2, p0, Lfi3;->b:Le55;

    .line 11
    .line 12
    const-wide/16 p1, 0x3a98

    .line 13
    .line 14
    iput-wide p1, p0, Lfi3;->g:J

    .line 15
    .line 16
    new-instance p1, Lf55;

    .line 17
    .line 18
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 19
    .line 20
    .line 21
    new-instance p2, Landroid/util/Range;

    .line 22
    .line 23
    const-wide/16 v0, 0x0

    .line 24
    .line 25
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    .line 30
    .line 31
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-direct {p2, v0, v1}, Landroid/util/Range;-><init>(Ljava/lang/Comparable;Ljava/lang/Comparable;)V

    .line 36
    .line 37
    .line 38
    iput-object p2, p1, Lf55;->d:Landroid/util/Range;

    .line 39
    .line 40
    invoke-virtual {p2}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    check-cast p2, Ljava/lang/Double;

    .line 45
    .line 46
    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    .line 47
    .line 48
    .line 49
    move-result-wide v0

    .line 50
    iput-wide v0, p1, Lf55;->c:D

    .line 51
    .line 52
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    iput-wide v0, p1, Lf55;->a:J

    .line 58
    .line 59
    iput-wide v0, p1, Lf55;->b:J

    .line 60
    .line 61
    iput-object p1, p0, Lfi3;->h:Lf55;

    .line 62
    .line 63
    sget-object p1, Lvp4;->a:Lvp4;

    .line 64
    .line 65
    iput-object p1, p0, Lfi3;->e:Lvp4;

    .line 66
    .line 67
    return-void
.end method
