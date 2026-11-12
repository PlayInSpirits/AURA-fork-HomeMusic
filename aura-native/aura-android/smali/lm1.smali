.class public final Llm1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lz84;


# instance fields
.field public final a:Lkx;

.field public final b:Len1;

.field public final c:J

.field public d:J

.field public e:J


# direct methods
.method public constructor <init>(Lkx;)V
    .locals 2

    .line 1
    new-instance v0, Len1;

    .line 2
    .line 3
    invoke-direct {v0}, Len1;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Llm1;->a:Lkx;

    .line 10
    .line 11
    iput-object v0, p0, Llm1;->b:Len1;

    .line 12
    .line 13
    const-wide/16 v0, 0x4e20

    .line 14
    .line 15
    iput-wide v0, p0, Llm1;->c:J

    .line 16
    .line 17
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    iput-wide v0, p0, Llm1;->e:J

    .line 23
    .line 24
    return-void
.end method
