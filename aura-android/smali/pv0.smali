.class public final Lpv0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public a:Lcc;

.field public b:Laa;

.field public c:J

.field public d:I

.field public final e:Lmz;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    iput-wide v0, p0, Lpv0;->c:J

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput v0, p0, Lpv0;->d:I

    .line 10
    .line 11
    new-instance v0, Lmz;

    .line 12
    .line 13
    invoke-direct {v0}, Lmz;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lpv0;->e:Lmz;

    .line 17
    .line 18
    return-void
.end method
