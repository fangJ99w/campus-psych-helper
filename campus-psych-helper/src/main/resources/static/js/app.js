// 用户注册
document.getElementById('register-form').addEventListener('submit', function(event) {
    event.preventDefault();
    const username = document.getElementById('register-username').value;
    const password = document.getElementById('register-password').value;

    fetch('/auth/register', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({ username, password })
    }).then(response => response.json())
      .then(data => {
          document.getElementById('register-message').textContent = data.message || '注册成功！';
      })
      .catch(error => {
          document.getElementById('register-message').textContent = '注册失败！';
      });
});

// 用户登录
document.getElementById('login-form').addEventListener('submit', function(event) {
    event.preventDefault();
    const username = document.getElementById('login-username').value;
    const password = document.getElementById('login-password').value;

    fetch('/auth/login', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({ username, password })
    }).then(response => response.json())
      .then(data => {
          document.getElementById('login-message').textContent = data.message || '登录成功！';
      })
      .catch(error => {
          document.getElementById('login-message').textContent = '登录失败！';
      });
});

// 发送消息
document.getElementById('send-message-form').addEventListener('submit', function(event) {
    event.preventDefault();
    const content = document.getElementById('message-content').value;

    fetch('/chat/send', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({ content, userId: 1 }) // 假设用户 ID 为 1
    }).then(response => response.json())
      .then(data => {
          document.getElementById('send-message-message').textContent = data.message || '消息发送成功！';
      })
      .catch(error => {
          document.getElementById('send-message-message').textContent = '消息发送失败！';
      });
});

// 获取聊天记录
document.getElementById('load-chat-history').addEventListener('click', function() {
    fetch('/chat/history/1') // 假设用户 ID 为 1
        .then(response => response.json())
        .then(data => {
            const chatHistoryList = document.getElementById('chat-history-list');
            chatHistoryList.innerHTML = ''; // 清空列表
            data.forEach(record => {
                const li = document.createElement('li');
                li.textContent = `${record.timestamp}: ${record.content}`;
                chatHistoryList.appendChild(li);
            });
        })
        .catch(error => {
            console.error('加载聊天记录失败:', error);
        });
});