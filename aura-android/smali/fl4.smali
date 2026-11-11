.class public final Lfl4;
.super Lxb1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic b:Lm84;

.field public final synthetic c:Le20;


# direct methods
.method public constructor <init>(Le20;Lm84;Lm84;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lfl4;->c:Le20;

    .line 2
    .line 3
    iput-object p3, p0, Lfl4;->b:Lm84;

    .line 4
    .line 5
    invoke-direct {p0, p2}, Lxb1;-><init>(Lm84;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final e(J)Ll84;
    .locals 8

    .line 1
    iget-object v0, p0, Lfl4;->b:Lm84;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lm84;->e(J)Ll84;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    new-instance p2, Ll84;

    .line 8
    .line 9
    new-instance v0, Lo84;

    .line 10
    .line 11
    iget-object v1, p1, Ll84;->a:Lo84;

    .line 12
    .line 13
    iget-wide v2, v1, Lo84;->a:J

    .line 14
    .line 15
    iget-wide v4, v1, Lo84;->b:J

    .line 16
    .line 17
    iget-object p0, p0, Lfl4;->c:Le20;

    .line 18
    .line 19
    iget-wide v6, p0, Le20;->o:J

    .line 20
    .line 21
    add-long/2addr v4, v6

    .line 22
    invoke-direct {v0, v2, v3, v4, v5}, Lo84;-><init>(JJ)V

    .line 23
    .line 24
    .line 25
    new-instance p0, Lo84;

    .line 26
    .line 27
    iget-object p1, p1, Ll84;->b:Lo84;

    .line 28
    .line 29
    iget-wide v1, p1, Lo84;->a:J

    .line 30
    .line 31
    iget-wide v3, p1, Lo84;->b:J

    .line 32
    .line 33
    add-long/2addr v3, v6

    .line 34
    invoke-direct {p0, v1, v2, v3, v4}, Lo84;-><init>(JJ)V

    .line 35
    .line 36
    .line 37
    invoke-direct {p2, v0, p0}, Ll84;-><init>(Lo84;Lo84;)V

    .line 38
    .line 39
    .line 40
    return-object p2
.end method
