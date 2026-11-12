.class public abstract Lkg3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final a:Lk52;

.field public static final b:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lk52;

    .line 2
    .line 3
    const/16 v1, 0x1b

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lk52;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lkg3;->a:Lk52;

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    const/16 v1, 0xf

    .line 12
    .line 13
    invoke-static {v0, v0, v1}, Lqc0;->b(III)J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    sput-wide v0, Lkg3;->b:J

    .line 18
    .line 19
    return-void
.end method
