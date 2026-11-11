.class public final Loh3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Ljava/lang/String;

.field public b:J

.field public final c:Ljava/lang/String;

.field public final d:Lag2;

.field public final e:Lk62;

.field public f:Ljava/lang/String;

.field public g:J


# direct methods
.method public constructor <init>(Ljava/lang/String;JLjava/lang/String;Lag2;Lk62;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Loh3;->a:Ljava/lang/String;

    .line 8
    .line 9
    iput-wide p2, p0, Loh3;->b:J

    .line 10
    .line 11
    iput-object p4, p0, Loh3;->c:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p5, p0, Loh3;->d:Lag2;

    .line 14
    .line 15
    iput-object p6, p0, Loh3;->e:Lk62;

    .line 16
    .line 17
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Loh3;->f:Ljava/lang/String;

    .line 29
    .line 30
    return-void
.end method
